package com.freeit.lesson13;

import com.freeit.lesson13.annatation.IsSecretPhone;
import com.freeit.lesson13.annatation.PhoneGenerallyReady;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * Created by Artem Peshko on 02.08.2022
 * E-Mail artem.peshko@alseda.by
 * E-Mail artem.peshko@gmail.com
 */
public class PhoneRunner {
    public static void main(String[] args) throws Exception {
        annotationAnalizator(Telephone.class);
    }

    public static void annotationAnalizator(Class<?> clazz) throws Exception {
        boolean isSecretAnnotationPresent = clazz.isAnnotationPresent(IsSecretPhone.class);
        if (isSecretAnnotationPresent) {
            IsSecretPhone isSecretPhone = clazz.getAnnotation(IsSecretPhone.class);
            if (isSecretPhone.secret()) {
                Method[] methods = clazz.getDeclaredMethods();
                for (Method method : methods) {
                    boolean phoneGenerallyReadyPresent = method.isAnnotationPresent(PhoneGenerallyReady.class);
                    if (phoneGenerallyReadyPresent) {
                        PhoneGenerallyReady generallyReady = method.getAnnotation(PhoneGenerallyReady.class);
                        if (generallyReady.status()) {
                            Constructor<?> constructor = clazz.getConstructor(String.class);
                            Telephone phone = (Telephone) constructor.newInstance("13 Pro Max");
                            method.setAccessible(true);
                            method.invoke(phone);
                        } else {
                            System.out.println("Phone not ready for unblock");
                        }
                    }
                }
            } else {
                System.out.println("Your phone is not secret");
            }
        } else {
            System.out.println("Annotation IsSecretPhone is not presented");
        }
    }
}

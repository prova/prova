package org.provarules.util2;

public class ProvaClassUtils {

    /**
     * A helper method attempting to retrieve a `Class` given its fully qualified name
     *
     * @param className String
     * @return Class
     * @throws ClassNotFoundException Exception thrown when class is not found
     */
    public static Class<?> forName(String className) throws ClassNotFoundException {
        try {
            return Thread.currentThread().getContextClassLoader().loadClass(className);
        } catch (Exception e) {
            return ProvaClassUtils.class.getClassLoader().loadClass(className);
        }
    }

    /**
     * A default procedure for finding classes given their simple or
     * qualified names in Prova scripts.
     * Multiple attempts are made to discover the class.
     *
     * @param var String the name of the class or a fully qualified name.
     * @return Class
     */
    public static Class<?> findClass(String var) {
        Class<?> cl = null;
        try {
            try {
                try {
                    cl = forName("org.provarules." + var);
                } catch (Exception exc) {
                    cl = forName("java.lang." + var);
                }
            } catch (Exception ex) {
                cl = forName(var);
            }
        } catch (ClassNotFoundException ex) {
        }
        return cl;
    }

}

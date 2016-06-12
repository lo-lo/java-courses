public class Calculate {
    public Calculate() {
    }

    public static void main(String[] arg) {
        System.out.println("Calculate...");
        int var1 = Integer.valueOf(arg[0]).intValue();
        int var2 = Integer.valueOf(arg[1]).intValue();
        int var3 = var1 + var2;
        System.out.println("Sum " + var3);
        int var4 = var1 - var2;
        System.out.println("minus = " + var4);
        int var5 = var1 * var2;
        System.out.println("mult = " + var5);
        int var6 = var1 / var2;
        System.out.println("delenie = " + var6);

        int var7;
        for(var7 = var1; var2 > 1; --var2) {
            var7 = var1 * var7;
        }

        System.out.println("stepen = " + var7);
    }
}

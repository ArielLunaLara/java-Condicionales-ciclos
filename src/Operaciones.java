public class Operaciones {
    public static void main(String[] args)
    {
        args = new String[]{"1", "3", "2", "6", "3", "4", "10", "2"};
        int i = 0;
        int num1, num2,operacion;
        operacion = 1;
        while(i < args.length && operacion < 5)
        {
            num1 = Integer.parseInt(args[i++]);
            num2 = Integer.parseInt(args[i++]);
            if(operacion == 1) {
                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
            }else if (operacion == 2) {
                System.out.println(num1+ " - " +num2+ " = " +(num1 - num2));
            } else if (operacion == 3) {
                System.out.println(num1+ " * " +num2+ " = " +(num1 * num2));
            } else if (operacion == 4) {
                System.out.println(num1+ " / " +num2+ " = " +(num1 * num2));
            }
            operacion++;
        }
    }
}

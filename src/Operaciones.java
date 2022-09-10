public class Operaciones {
    public static void main(String[] args)
    {
        double resultado, num1, num2;
        for(int j = 0; j < 3; j++)
        {
            for(int i = 0; i < 4; i++)
            {
                num1 = Math.random();
                num2 = Math.random();
                if(i == 0)
                {
                    resultado = num1 + num2;
                    System.out.println(num1+" + "+num2+" = "+resultado);
                } else if (i == 1) {
                    resultado = num1 - num2;
                    System.out.println(num1+" - "+num2+" = "+resultado);
                } else if (i == 2) {
                    resultado = num1 * num2;
                    System.out.println(num1 + " * " + num2 + " = " + resultado);
                } else {
                    resultado = num1 / num2;
                    System.out.println(num1 + " / " + num2 + " = " + resultado);
                }
            }
            System.out.println();
        }
    }
}

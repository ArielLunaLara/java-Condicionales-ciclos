public class Operaciones {

    public static void main(String[] args) {
        int index = 0;
        do {
            String operation = args[index++];
            int operandLeft = Integer.parseInt(args[index++]);
            int operandRight = Integer.parseInt(args[index++]);
            switch (operation) {
                case "Suma":
                    System.out.println(operandLeft + " + " + operandRight + " = " + (operandLeft + operandRight));
                    break;
                case "Resta":
                    System.out.println(operandLeft + " - " + operandRight + " = " + (operandLeft - operandRight));
                    break;
                case "Multiplicacion":
                    System.out.println(operandLeft + " * " + operandRight + " = " + (operandLeft * operandRight));
                    break;
                case "Division":
                    System.out.println(operandLeft + " / " + operandRight + " = " + (operandLeft / operandRight));
                    break;
            }
        } while (index < args.length);
    }
    }
}

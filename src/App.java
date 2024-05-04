import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner entrada = new Scanner(System.in);

        boolean continuar = true;

        System.out.println("Bem-vindo à calculadora!");

        while (continuar){        

        System.out.println("Qual operação deseja fazer?");
        System.out.println("1-Soma/2-Subtração/3-Multiplicação/4-Divisão/5-Sair");
        int operacao = entrada.nextInt();

        if(operacao != 5){    

        System.out.println("Digite o primeiro número: ");
        int n1 = entrada.nextInt();
        System.out.println("Digite o segundo número: ");
        int n2 = entrada.nextInt();

        

        int soma = n1+n2;
        int sub = n1-n2;
        int sub2 = n2-n1;
        int mult = n1*n2;
        int div = n1/n2;
        int div2 = n2/n1;

        switch (operacao) {
            case 1:
            System.out.println("Resultado:");
                System.out.println(soma);
                break;
            case 2:
                System.out.println("1: " + n1 +"-"+n2 + " ou 2: " +n2+"-"+n1+"?");
                int escolhasub = entrada.nextInt();
                if(escolhasub == 1){
                    System.out.println("Resultado:");
                System.out.println(sub);
                }else{
                    System.out.println("Resultado:");
                    System.out.println(sub2);
                }
                break;
            case 3:
            System.out.println("Resultado:");
                System.out.println(mult);
                break;
            case 4:
            System.out.println("1: " + n1 +"/"+n2 + " ou 2: " +n2+"/"+n1+"?");
            int escolhadiv = entrada.nextInt();
            if(escolhadiv == 1){
                System.out.println("Resultado:");
            System.out.println(div);
            }else{
                System.out.println("Resultado:");
                System.out.println(div2);
            }
            break;
            
           default:
            System.out.println("Número inexistente, tente outro.");
            break;
        }
    }
    else{
        System.out.println("PROGRAMA FINALIZADO!");
        System.exit(0);
    }

}


        entrada.close();
       
}

}
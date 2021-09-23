
package separadordereciclagens;


import java.util.Locale;
import java.util.Scanner;


public class SeparadorDeReciclagem {

  
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Papel papel = new Papel();
        Plastico plastico = new Plastico();
        Metal metais = new Metal();
        Vidro vidros = new Vidro();
        Organicos organicos = new Organicos();
        char resp;
        do{
           int opcao;
            System.out.println("--------------Coletor de lixos--------------");
            System.out.println("Escolha uma das categorias para o descartes:");
            System.out.println("--------------MAX: 100.0 KG-----------------");
            System.out.println("[1] PALPEL\n[2] PLASTICO\n[3] VIDROS\n[4] METAIS\n[5] ORGANICOS\n[6] STATUS GERAL");
            System.out.print("Escolha umas das opções: ");
            opcao = sc.nextInt();
            if (opcao == 1){
                
                do{
                    System.out.println("---- materiais de Papel: ----");
                    System.out.println("[1] Depositar o lixo\n[2] Reciclar o lixo\n[3] Status");
                    System.out.print("Escolha uma das opções: ");
                    opcao = sc.nextInt();
                    if (opcao == 1){
                        do{ 
                            System.out.print("Quantos Kg de Papel gostaria de depositar? ");
                            papel.depositarLixo(sc.nextDouble());
                            System.out.println(" ");
                            System.out.print("Deseja depositar mais Papel na lixeira?[sim/nao] ");
                            resp = sc.next().charAt(0);
                            if (resp == 's'){
                                resp = 's';
                            }else if (resp == 'n'){
                                resp = 'n';
                            }else{
                                System.out.print("Resposta Invalida, tente novamente:[sim/nao] ");
                                resp = sc.next().charAt(0);
                                while (resp != 's' && resp != 'n'){
                                    System.out.print("Resposta Invalida, tente novamente:[sim/nao] ");
                                    resp = sc.next().charAt(0);
                                }
                            }
                            
                            System.out.println(" ");
                        }while(resp != 'n' && papel.peso < 100);
                        if (papel.peso >= 100 ){
                            System.out.println("Não é possivel mais depositar lixo MAX: 100.0 Kg");
                            System.out.println(" ");
                        }else{
                            System.out.println("Seu deposito foi feito com sucesso");
                            System.out.println(" ");
                        }
                    }
                    else  if (opcao == 2){
                        do{ 
                            System.out.print("Quantos Kg de Papel gostaria de Reciclar? ");
                            papel.reciclarLixo(sc.nextDouble());
                            System.out.println(" ");
                            System.out.print("Deseja Reciclar mas Papel?[sim/nao] ");
                            resp = sc.next().charAt(0);
                            if (resp == 's'){
                                resp = 's';
                            }else if (resp == 'n'){
                                resp = 'n';
                            }else{
                                System.out.print("Resposta Invalida, tente novamente:[sim/nao] ");
                                resp = sc.next().charAt(0);
                                while (resp != 's' && resp != 'n'){
                                    System.out.print("Resposta Invalida, tente novamente:[sim/nao] ");
                                    resp = sc.next().charAt(0);
                                }
                            }
                            System.out.println(" ");
                        }while(resp != 'n' && papel.peso > 0);
                        if (papel.peso <= 0 ){
                            System.out.println("Não é possivel mais Reciclar pois a lixeira já está vazia!\nmuito Obrigado!! sua Ação é bem vinda!!");
                            System.out.println(" ");
                        }else{
                            System.out.println("Muito obrigado!! sua Ação é bem vinda!");
                            System.out.println(" ");
                        }
                        
                        
                    }
                    else  if (opcao == 3){
                        papel.status();
                    }
                    else{
                        System.out.println("Opção Invalida tente novamente!");
                    }
                     System.out.print("Gostaria de continuar com as Opções?[sim/nao] ");
                     resp = sc.next().charAt(0);
                      if (resp == 's'){
                                resp = 's';
                            }else if (resp == 'n'){
                                resp = 'n';
                            }else{
                                System.out.print("Resposta Invalida, tente novamente:[sim/nao] ");
                                resp = sc.next().charAt(0);
                                while (resp != 's' && resp != 'n'){
                                    System.out.print("Resposta Invalida, tente novamente:[sim/nao] ");
                                    resp = sc.next().charAt(0);
                                }
                            }
                            
                            System.out.println(" ");
                } while(resp != 'n');          
            }
            else if (opcao == 2){
                do{
                    System.out.println("---- materiais de Plastico: ----");
                    System.out.println("[1] Depositar o lixo\n[2] Reciclar o lixo\n[3] Status");
                    System.out.print("Escolha uma das opÃ§Ãµes: ");
                    opcao = sc.nextInt();
                    if (opcao == 1){   
                                                      
                        do{ 
                            System.out.print("Quantos Kg de Plastico gostaria de depositar? ");
                            plastico.depositarLixo(sc.nextDouble());
                            System.out.println(" ");
                            System.out.print("Deseja depositar mais Plastico na lixeira?[sim/nao] ");
                            resp = sc.next().charAt(0);
                            
                            System.out.println(" "); if (resp == 's'){
                                resp = 's';
                            }else if (resp == 'n'){
                                resp = 'n';
                            }else{
                                System.out.print("Resposta Invalida, tente novamente:[sim/nao] ");
                                resp = sc.next().charAt(0);
                                while (resp != 's' && resp != 'n'){
                                    System.out.print("Resposta Invalida, tente novamente:[sim/nao] ");
                                    resp = sc.next().charAt(0);
                                }
                            }
                            
                            System.out.println(" ");
                        }while(resp != 'n' && plastico.peso < 100);
                        if (plastico.peso >= 100 ){
                            System.out.println("NÃ£o Ã© possivel mais depositar lixo MAX: 100.0 Kg");
                            System.out.println(" ");
                        }else{
                            System.out.println("Seu deposito foi feito com sucesso");
                            System.out.println(" ");
                        }
                    }
                    else  if (opcao == 2){
                        do{ 
                            System.out.print("Quantos Kg de plastico gostaria de Reciclar? ");
                            plastico.reciclarLixo(sc.nextDouble());
                            System.out.println(" ");
                            System.out.print("Deseja Reciclar mas plastico?[sim,nao] ");
                            resp = sc.next().charAt(0);
                             if (resp == 's'){
                                resp = 's';
                            }else if (resp == 'n'){
                                resp = 'n';
                            }else{
                                System.out.print("Resposta Invalida, tente novamente:[sim/nao] ");
                                resp = sc.next().charAt(0);
                                while (resp != 's' && resp != 'n'){
                                    System.out.print("Resposta Invalida, tente novamente:[sim/nao] ");
                                    resp = sc.next().charAt(0);
                                }
                            }
                            
                            System.out.println(" ");
                        }while(resp != 'n' && plastico.peso > 0);
                        if (plastico.peso <= 0 ){
                            System.out.println("NÃ£o Ã© possivel mais Reciclar pois a lixeira jÃ¡ estÃ¡ vazia!\nmuito Obrigado!! sua aÃ§Ã£o Ã© bem vinda!!");
                            System.out.println(" ");
                        }else{
                            System.out.println("Muito obrigado!! sua aÃ§Ã£o Ã© bem vinda!");
                            System.out.println(" ");
                        }
                    }
                    else  if (opcao == 3){
                        plastico.status();
                    }
                    else{
                        System.out.println("OpÃ§Ã£o Invalida tente novamente!");
                    }
                     System.out.print("Gostaria de continuar com as opcÃµes?[sim/nao] ");
                     resp = sc.next().charAt(0);
                      if (resp == 's'){
                                resp = 's';
                            }else if (resp == 'n'){
                                resp = 'n';
                            }else{
                                System.out.print("Resposta Invalida, tente novamente:[sim/nao] ");
                                resp = sc.next().charAt(0);
                                while (resp != 's' && resp != 'n'){
                                    System.out.print("Resposta Invalida, tente novamente:[sim/nao] ");
                                    resp = sc.next().charAt(0);
                                }
                            }
                            
                            System.out.println(" ");
                } while(resp != 'n');
            }
            else if (opcao == 3){
                do{
                    System.out.println("---- materiais de Metais: ----");
                    System.out.println("[1] Depositar o lixo\n[2] Reciclar o lixo\n[3] Status");
                    System.out.print("Escolha uma das opÃ§Ãµes: ");
                    opcao = sc.nextInt();
                    if (opcao == 1){
                       do{ 
                            System.out.print("Quantos Kg de Metais gostaria de depositar? ");
                            metais.depositarLixo(sc.nextDouble());
                            System.out.println(" ");
                            System.out.print("Deseja depositar mais Metais na lixeira?[sim/nao] ");
                            resp = sc.next().charAt(0);
                             if (resp == 's'){
                                resp = 's';
                            }else if (resp == 'n'){
                                resp = 'n';
                            }else{
                                System.out.print("Resposta Invalida, tente novamente:[sim/nao] ");
                                resp = sc.next().charAt(0);
                                while (resp != 's' && resp != 'n'){
                                    System.out.print("Resposta Invalida, tente novamente:[sim/nao] ");
                                    resp = sc.next().charAt(0);
                                }
                            }
                            
                            System.out.println(" ");
                        }while(resp != 'n' && metais.peso < 100);
                        if (metais.peso >= 100 ){
                            System.out.println("NÃ£o Ã© possivel mais depositar lixo MAX: 100.0 Kg");
                            System.out.println(" ");
                        }else{
                            System.out.println("Seu deposito foi feito com sucesso");
                            System.out.println(" ");
                        }
                    }
                    else  if (opcao == 2){
                       do{ 
                            System.out.print("Quantos Kg de Metais gostaria de Reciclar? ");
                            metais.reciclarLixo(sc.nextDouble());
                            System.out.println(" ");
                            System.out.print("Deseja Reciclar mas Metais?[sim/nao] ");
                            resp = sc.next().charAt(0);
                             if (resp == 's'){
                                resp = 's';
                            }else if (resp == 'n'){
                                resp = 'n';
                            }else{
                                System.out.print("Resposta Invalida, tente novamente:[sim/nao] ");
                                resp = sc.next().charAt(0);
                                while (resp != 's' && resp != 'n'){
                                    System.out.print("Resposta Invalida, tente novamente:[sim/nao] ");
                                    resp = sc.next().charAt(0);
                                }
                            }
                            
                            System.out.println(" ");
                        }while(resp != 'n' && metais.peso > 0);
                        if (metais.peso <= 0 ){
                            System.out.println("NÃ£o Ã© possivel mais Reciclar pois a lixeira jÃ¡ estÃ¡ vazia!\nmuito Obrigado!! sua aÃ§Ã£o Ã© bem vinda!!");
                            System.out.println(" ");
                        }else{
                            System.out.println("Muito obrigado!! sua aÃ§Ã£o Ã© bem vinda!");
                            System.out.println(" ");
                        }
                    }
                    else  if (opcao == 3){
                        metais.status();
                    }
                    else{
                        System.out.println("OpÃ§Ã£o Invalida tente novamente!");
                    }
                     System.out.print("Gostaria de continuar com as opcÃµes?[sim/nao] ");
                     resp = sc.next().charAt(0);
                      if (resp == 's'){
                                resp = 's';
                            }else if (resp == 'n'){
                                resp = 'n';
                            }else{
                                System.out.print("Resposta Invalida, tente novamente:[sim/nao] ");
                                resp = sc.next().charAt(0);
                                while (resp != 's' && resp != 'n'){
                                    System.out.print("Resposta Invalida, tente novamente:[sim/nao] ");
                                    resp = sc.next().charAt(0);
                                }
                            }
                            
                            System.out.println(" ");
                } while(resp != 'n');
            }
            else if (opcao == 4){
                do{
                    System.out.println("---- materiais de Vidros: ----");
                    System.out.println("[1] Depositar o lixo\n[2] Reciclar o lixo\n[3] Status");
                    System.out.print("Escolha uma das opÃ§Ãµes: ");
                    opcao = sc.nextInt();
                    if (opcao == 1){
                        do{ 
                            System.out.print("Quantos Kg de Vidros gostaria de depositar? ");
                            vidros.depositarLixo(sc.nextDouble());
                            System.out.println(" ");
                            System.out.print("Deseja depositar mais Vidros na lixeira?[sim/nao] ");
                            resp = sc.next().charAt(0);
                             if (resp == 's'){
                                resp = 's';
                            }else if (resp == 'n'){
                                resp = 'n';
                            }else{
                                System.out.print("Resposta Invalida, tente novamente:[sim/nao] ");
                                resp = sc.next().charAt(0);
                                while (resp != 's' && resp != 'n'){
                                    System.out.print("Resposta Invalida, tente novamente:[sim/nao] ");
                                    resp = sc.next().charAt(0);
                                }
                            }
                            
                            System.out.println(" ");
                        }while(resp != 'n' && vidros.peso < 100);
                        if (vidros.peso >= 100 ){
                            System.out.println("NÃ£o Ã© possivel mais depositar lixo MAX: 100.0 Kg");
                            System.out.println(" ");
                        }else{
                            System.out.println("Seu deposito foi feito com sucesso");
                            System.out.println(" ");
                        }
                    }
                    else  if (opcao == 2){
                        do{ 
                            System.out.print("Quantos Kg de Vidros gostaria de Reciclar? ");
                           vidros.reciclarLixo(sc.nextDouble());
                            System.out.println(" ");
                            System.out.print("Deseja Reciclar mas Vidros?[sim/nao] ");
                            resp = sc.next().charAt(0);
                             if (resp == 's'){
                                resp = 's';
                            }else if (resp == 'n'){
                                resp = 'n';
                            }else{
                                System.out.print("Resposta Invalida, tente novamente:[sim/nao] ");
                                resp = sc.next().charAt(0);
                                while (resp != 's' && resp != 'n'){
                                    System.out.print("Resposta Invalida, tente novamente:[sim/nao] ");
                                    resp = sc.next().charAt(0);
                                }
                            }
                            
                            System.out.println(" ");
                        }while(resp != 'n' && vidros.peso > 0);
                        if (vidros.peso <= 0 ){
                            System.out.println("NÃ£o Ã© possivel mais Reciclar pois a lixeira jÃ¡ estÃ¡ vazia!\nmuito Obrigado!! sua aÃ§Ã£o Ã© bem vinda!!");
                            System.out.println(" ");
                        }else{
                            System.out.println("Muito obrigado!! sua aÃ§Ã£o Ã© bem vinda!");
                            System.out.println(" ");
                        }
                    }
                    else  if (opcao == 3){
                        vidros.status();
                    }
                    else{
                        System.out.println("OpÃ§Ã£o Invalida tente novamente!");
                    }
                     System.out.print("Gostaria de continuar com as opcÃµes?[sim/nao] ");
                     resp = sc.next().charAt(0);
                      if (resp == 's'){
                                resp = 's';
                            }else if (resp == 'n'){
                                resp = 'n';
                            }else{
                                System.out.print("Resposta Invalida, tente novamente:[sim/nao] ");
                                resp = sc.next().charAt(0);
                                while (resp != 's' && resp != 'n'){
                                    System.out.print("Resposta Invalida, tente novamente:[sim/nao] ");
                                    resp = sc.next().charAt(0);
                                }
                            }
                            
                            System.out.println(" ");
                } while(resp != 'n');
            }
             else if (opcao == 5){
                do{
                    System.out.println("---- materiais Organicos: ----");
                    System.out.println("[1] Depositar o lixo\n[2] Reciclar o lixo\n[3] Status");
                    System.out.print("Escolha uma das opÃ§Ãµes: ");
                    opcao = sc.nextInt();
                    if (opcao == 1){
                       do{ 
                            System.out.print("Quantos Kg de Organicos gostaria de depositar? ");
                            organicos.depositarLixo(sc.nextDouble());
                            System.out.println(" ");
                            System.out.print("Deseja depositar mais Organicos na lixeira?[sim/nao] ");
                            resp = sc.next().charAt(0);
                             if (resp == 's'){
                                resp = 's';
                            }else if (resp == 'n'){
                                resp = 'n';
                            }else{
                                System.out.print("Resposta Invalida, tente novamente:[sim/nao] ");
                                resp = sc.next().charAt(0);
                                while (resp != 's' && resp != 'n'){
                                    System.out.print("Resposta Invalida, tente novamente:[sim/nao] ");
                                    resp = sc.next().charAt(0);
                                }
                            }
                            
                            System.out.println(" ");
                        }while(resp != 'n' && organicos.peso < 100);
                        if (organicos.peso >= 100 ){
                            System.out.println("NÃ£o Ã© possivel mais depositar lixo MAX: 100.0 Kg");
                            System.out.println(" ");
                        }else{
                            System.out.println("Seu deposito foi feito com sucesso");
                            System.out.println(" ");
                        }
                    }
                    else  if (opcao == 2){
                        do{ 
                            System.out.print("Quantos Kg de Organicos gostaria de Reciclar? ");
                            organicos.reciclarLixo(sc.nextDouble());
                            System.out.println(" ");
                            System.out.print("Deseja Reciclar mas Organicos?[sim/nao]");
                            resp = sc.next().charAt(0);
                             if (resp == 's'){
                                resp = 's';
                            }else if (resp == 'n'){
                                resp = 'n';
                            }else{
                                System.out.print("Resposta Invalida, tente novamente:[sim/nao] ");
                                resp = sc.next().charAt(0);
                                while (resp != 's' && resp != 'n'){
                                    System.out.print("Resposta Invalida, tente novamente:[sim/nao] ");
                                    resp = sc.next().charAt(0);
                                }
                            }
                            
                            System.out.println(" ");
                        }while(resp != 'n' && organicos.peso > 0);
                        if (organicos.peso <= 0 ){
                            System.out.println("NÃ£o Ã© possivel mais Reciclar pois a lixeira jÃ¡ estÃ¡ vazia!\nmuito Obrigado!! sua aÃ§Ã£o Ã© bem vinda!!");
                            System.out.println(" ");
                        }else{
                            System.out.println("Muito obrigado!! sua aÃ§Ã£o Ã© bem vinda!");
                            System.out.println(" ");
                        }
                    }
                    else  if (opcao == 3){
                        organicos.status();
                    }
                    else{
                        System.out.println("OpÃ§Ã£o Invalida tente novamente!");
                    }
                     System.out.print("Gostaria de continuar com as opcÃµes?[sim/nao] ");
                     resp = sc.next().charAt(0);
                      if (resp == 's'){
                                resp = 's';
                            }else if (resp == 'n'){
                                resp = 'n';
                            }else{
                                System.out.print("Resposta Invalida, tente novamente:[sim/nao] ");
                                resp = sc.next().charAt(0);
                                while (resp != 's' && resp != 'n'){
                                    System.out.print("Resposta Invalida, tente novamente:[sim/nao] ");
                                    resp = sc.next().charAt(0);
                                }
                            }
                            
                            System.out.println(" ");
                } while(resp != 'n');
            }
             else if (opcao == 6){
                System.out.println("---Status gerais da coleta---");
                System.out.println("Papel: " + papel.getPeso() + " Kg");
                System.out.println("Plasticos: " + plastico.getPeso() + " Kg");
                System.out.println("Metais: " + metais.getPeso() + "Kg");
                System.out.println("Vidros: " + vidros.getPeso() + " Kg");
                System.out.println("Organicos: " + organicos.getPeso() + " Kg");
                System.out.println("Postos mais pertos da sua casa! ");
             }
            else{
                System.out.println("OpÃ§Ã£o Invalida tente novamente!");
            }
           
            System.out.print("Gostaria de continuar com a reciclagem?[sim/nao] ");
            resp = sc.next().charAt(0);
             if (resp == 's'){
                                resp = 's';
                            }else if (resp == 'n'){
                                resp = 'n';
                            }else{
                                System.out.print("Resposta Invalida, tente novamente:[sim/nao] ");
                                resp = sc.next().charAt(0);
                                while (resp != 's' && resp != 'n'){
                                    System.out.print("Resposta Invalida, tente novamente:[sim/nao] ");
                                    resp = sc.next().charAt(0);
                                }
                            }
                            
                            System.out.println(" ");
        } while (resp != 'n');
        sc.close();
    }
}


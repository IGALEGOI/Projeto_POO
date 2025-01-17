package projeto;
import java.util.Scanner;

public class Menus {
    Scanner sc = new Scanner(System.in);
    Mamifero [] mamiferos = new Mamifero[100];
    Peixe [] peixes = new Peixe[100];
    Reptil [] reptils = new Reptil[100];
    Ave [] aves = new Ave[100];
   
    public void menuPrincipal(){
        int escolha;
	do {
            System.out.println("\n--------- MENU DOS ANIMAIS ---------");
            System.out.println("[0] Cadastra Animal");
            System.out.println("[1] Ver Animais");
            System.out.println("[2] Sair");
            System.out.print("Sua escolha:");
            escolha = sc.nextInt();
	}while (escolha<0 || escolha>2 );
	if(escolha==0) {
            menuCadastraAnimais();
	}
	if(escolha==1) {
            menuVerAnimais();
	}
	if(escolha==2) {  
            System.out.println("");
	}
    }
    
    public void menuCadastraAnimais(){
    	int escolha;
        int cont = 0;
     	do {
            System.out.println("--------- MENU CADASTRO ANIMAIS ---------");
            System.out.println("[0] Peixe");
            System.out.println("[1] Ave");
            System.out.println("[2] Reptil");
            System.out.println("[3] Mamifero");
            System.out.println("[4] Voltar");
            System.out.print("Sua escolha:");
            escolha = sc.nextInt();
            }while (escolha<0 || escolha>4 );
                
                String cor = "";
                String nome = "";
                int idade = 0;
                int membros = 0;
                float peso = 0;
            
            if (escolha == 0) {
                int profundidade = 0; 
                do {sc.nextLine();
                    System.out.print("Cor da Escama: ");
                    cor = sc.nextLine();
                }while ("".equals(cor));
                do {System.out.print("Profundidade: ");
                    profundidade = sc.nextInt();
                    sc.nextLine();
                }while (profundidade < 0);
                do{System.out.print("Peso: ");
                    peso = sc.nextFloat();
                }while(peso < 0);
                do{System.out.print("Idade: ");
                    idade = sc.nextInt();
                }while( idade < 0);
                do{System.out.print("Membros: ");
                    membros = sc.nextInt();
                }while(membros < -1);
                do{sc.nextLine();    
                    System.out.print("Nome: ");
                    nome = sc.nextLine();
                }while("".equals(nome));
                for (int i = 0 ; i < 100; i++){
                    if (peixes[i]==null && cont == 0){
                        System.out.println("Cadastrado!!!");
                        cont = 1;
                        peixes[i] = new Peixe(cor,profundidade,peso,idade,membros,nome);
                        System.out.println("");
                    }
                }
                menuPrincipal();
            }
            if(escolha==1) {
                float bico =-1;
                do{sc.nextLine();
                    System.out.print("Cor da pena:");
                    cor = sc.nextLine();
                }while("".equals(cor));
                do{System.out.print("Tamanho do bico:");
                    bico = sc.nextFloat();
                }while(bico < 0);
                do{System.out.print("Peso:");
                    peso = sc.nextFloat();
                }while(peso < 0);
                do{System.out.print("Idade:");
                    idade = sc.nextInt();
                }while( idade < 0);
                do{ System.out.print("Membros:");          
                    membros = sc.nextInt();
                }while(membros < 0);
                do{ sc.nextLine();
                    System.out.print("Nome: ");
                    nome = sc.nextLine();
                }while("".equals(nome));
     		for (int i=0 ; i < 100 ; i++){
                    if (aves[i]==null && cont == 0) {
                        System.out.println("Cadastrado!!!");
                        cont = 1;
                	aves[i] = new Ave(cor,bico,peso,idade,membros,nome);
                    }
                }
            menuPrincipal();
            }
	    if(escolha==2) {
		boolean pp;     
                do{sc.nextLine();
                    System.out.print("Cor da escama:");
                    cor = sc.nextLine();
		}while("".equals(cor));
                System.out.print("Peconhento (true ou false):");
                pp = sc.nextBoolean();
     		do{System.out.print("Peso: ");         
                    peso = sc.nextFloat();
                }while(peso < 0);
                do{System.out.print("Idade: ");   
                    idade = sc.nextInt();
                }while( idade < 0);
                do{ System.out.print("Membros: ");          
                    membros = sc.nextInt();
                }while(membros < 0);
                do{ sc.nextLine();
                    System.out.print("Nome: ");
                    nome = sc.nextLine();
                }while("".equals(nome));
     		for (int i=0 ; i < 100 ; i++){
                    if (reptils[i]==null && cont==0) {
                        System.out.println("Cadastrado!!!");
                        cont = 1;
                        reptils[i] = new Reptil(cor,pp,peso,idade,membros,nome);
                    }
                }
                menuPrincipal();
            }
            if(escolha==3) {
                int velocidade = -1;
                do{ sc.nextLine();
                    System.out.print("Cor do pelo:");
                    cor = sc.nextLine();
                }while("".equals(cor));
                do{System.out.print("Velocidade:");
                    velocidade = sc.nextInt();
                }while(velocidade <0);                    
                do{System.out.print("Peso:");
                    peso = sc.nextFloat();
                }while(peso <0 );                    
                do{System.out.print("Idade:");
                    idade = sc.nextInt();
                }while( idade <0 );                   
                do{System.out.print("Membros:");
                    membros = sc.nextInt();
                }while(membros <0 );               
                do{sc.nextLine();
                    System.out.print("Nome: ");
                    nome = sc.nextLine();
                }while("".equals(nome));    		
                for (int i=0 ; i < 100 ; i++){
                    if (mamiferos[i]==null && cont==0) {
                        System.out.println("Cadastrado!!!");
                        cont = 1;
                	mamiferos[i] = new Mamifero(cor,velocidade,peso,idade,membros,nome);
                    }
                }              
                menuPrincipal();
            }
            if(escolha==4) {
                menuPrincipal();
	    }
    }
    
    public void menuVerAnimais(){
    	int escolha;
        int id=-1;
        
    	do {
            System.out.println("--------- MENU DO VISUALIZAÇÃO DE LISTA ---------");
            System.out.println("[0] Lista de Peixes");
            System.out.println("[1] Lista de Aves");
            System.out.println("[2] Lista de Raptils");
            System.out.println("[3] Lista de Mamiferos");
            System.out.println("[4] Voltar");
            System.out.print("Sua escolha:");
            escolha = sc.nextInt();
        }while (escolha<0 || escolha>4 );
    	
        switch (escolha) {
            case 0:
                if(this.isAnimalCadastrado(escolha))
                {
                    for (int i=0 ; i < 100 ; i++){
                        if (peixes[i]!=null) {
                            System.out.print("Peixe:"+i+" | Nome:");
                            System.out.println(peixes[i].getNome());
                        }
                    }
                    do{
                        System.out.println("--------------------------");
                        System.out.print("Digite o id do Animal de escolha: ");
                        id = sc.nextInt();
                        
                        if(peixes[id] == null){
                            System.out.print("O animal selecionado não existe!");
                        }
                    }while((id<0 || id>100) && peixes[id] != null);
                    System.out.print(peixes[id]);
                    
                    do{
                        System.out.println("----- MENU DE AÇÕES -----");
                        System.out.println("[0] Excluir Animal");
                        System.out.println("[1] Atualizar Animal");
                        System.out.println("[2] Emitir Som");
                        System.out.println("[3] Alimentar");
                        System.out.println("[4] Locomover");
                        System.out.println("[5] Fazer Bolhas");
                        System.out.println("[6] Voltar ao Menu");
                        System.out.print("Sua escolha:");
                        escolha = sc.nextInt();
                    }while(escolha < 0 || escolha > 6 );
                    if (escolha == 0){peixes[id]=null;} 
                    if (escolha == 1){
                    String cor = "";
                    String nome = "";
                    int idade = 0;
                    int membros = 0;
                    float peso = 0;
                    int profundidade = 0; 
                    do {sc.nextLine();
                        System.out.print("Cor da Escama: ");
                        cor = sc.nextLine();
                    }while ("".equals(cor));
                    do {System.out.print("Profundidade: ");
                        profundidade = sc.nextInt();
                        sc.nextLine();
                    }while (profundidade < 0);
                    do{System.out.print("Peso: ");
                        peso = sc.nextFloat();
                    }while(peso < 0);
                    do{System.out.print("Idade: ");
                        idade = sc.nextInt();
                    }while( idade < 0);
                    do{System.out.print("Membros: ");
                        membros = sc.nextInt();
                    }while(membros < -1);
                    do{sc.nextLine();    
                        System.out.print("Nome: ");
                        nome = sc.nextLine();
                    }while("".equals(nome));
                    
                    System.out.println("ATUALIZADO");
                    peixes[id] = new Peixe(cor,profundidade,peso,idade,membros,nome);
                    System.out.println("");
                    menuPrincipal();
                    }
                    if (escolha == 2){peixes[id].emitirSom();}
                    if (escolha == 3){peixes[id].alimentar();}
                    if (escolha == 4){peixes[id].locomover();}
                    if (escolha == 5){peixes[id].soltarBolha();}
                    if(escolha==6) {menuPrincipal();}
                }else{
                    System.out.println("Não existe cadastro em peixes!!");
                }   break;
            case 1:
                if(this.isAnimalCadastrado(escolha))
                {
                    for (int i=0 ; i < 100 ; i++){
                        if (aves[i]!=null) {
                            System.out.print("Ave:"+i+" | Nome:");
                            System.out.println(aves[i].getNome());
                        }
                    }
                    do{
                        System.out.println("--------------------------");
                        System.out.print("Digite o id do Animal de escolha: ");
                        id = sc.nextInt();
                        if(aves[id] == null){
                            System.out.print("O animal selecionado não existe!");
                        }
                    }while((id<0 || id>100) && aves[id] != null);
                    System.out.print(aves[id]);
                    
                    do{
                        System.out.println("----- MENU DE AÇÕES -----");
                        System.out.println("[0] Excluir Animal");
                        System.out.println("[1] Atualizar Animal");
                        System.out.println("[2] Emitir Som");
                        System.out.println("[3] Alimentar");
                        System.out.println("[4] Locomover");
                        System.out.println("[5] Fazer Ninho");
                        System.out.println("[6] Bicar");
                        System.out.println("[7] Voltar ao Menu");
                        System.out.print("Sua escolha:");
                        escolha = sc.nextInt();
                    }while(escolha < 0 || escolha > 7 );
                    if (escolha == 0){aves[id]=null;}
                    if (escolha == 1){
                    	String cor = "";
                        String nome = "";
                        int idade = 0;
                        int membros = 0;
                        float peso = 0;
                        float bico =-1;
                        do{sc.nextLine();
                            System.out.print("Cor da pena:");
                            cor = sc.nextLine();
                        }while("".equals(cor));
                        do{System.out.print("Tamanho do bico:");
                            bico = sc.nextFloat();
                        }while(bico < 0);
                        do{System.out.print("Peso:");
                            peso = sc.nextFloat();
                        }while(peso < 0);
                        do{System.out.print("Idade:");
                            idade = sc.nextInt();
                        }while( idade < 0);
                        do{ System.out.print("Membros:");          
                            membros = sc.nextInt();
                        }while(membros < 0);
                        do{ sc.nextLine();
                            System.out.print("Nome: ");
                            nome = sc.nextLine();
                        }while("".equals(nome));
                        System.out.println("ATUALIZADO");
                        aves[id] = new Ave(cor,bico,peso,idade,membros,nome);
                        menuPrincipal();
                    }
                    if (escolha == 2){aves[id].emitirSom();}
                    if (escolha == 3){aves[id].alimentar();}
                    if (escolha == 4){aves[id].locomover();}
                    if (escolha == 5){aves[id].fazerNinho();}
                    if (escolha == 6){aves[id].bicar();
                    if(escolha==7) {menuPrincipal();}}
                }else{
                    System.out.println("Não existe cadastro em aves!!");
                }   break;
            case 2:
                if(this.isAnimalCadastrado(escolha))
                {
                    for (int i=0 ; i < 100 ; i++){
                        if (reptils[i]!=null) {
                            System.out.print("Reptil:"+i+" | Nome:");
                            System.out.println(reptils[i].getNome());
                        }
                    }
                    do{
                        System.out.println("---------------------------");
                        System.out.print("Digite o id do Animal de escolha:");
                        id = sc.nextInt();
                        if(reptils[id] == null){
                            System.out.print("O animal selecionado não existe!");
                        }
                    }while((id<0 || id>100) && reptils[id] != null);
                    System.out.print(reptils[id]);
                    do{
                        System.out.println("----- MENU DE AÇÕES -----");
                        System.out.println("[0] Excluir Animal");
                        System.out.println("[2] Atualizar Animal");
                        System.out.println("[2] Emitir Som");
                        System.out.println("[3] Alimentar");
                        System.out.println("[4] Locomover");
                        System.out.println("[5] Envenenar");
                        System.out.println("[6] Voltar ao Menu");
                        System.out.print("Sua escolha:");
                        escolha = sc.nextInt();
                    }while(escolha < 0 || escolha > 6 );
                    if (escolha == 0){reptils[id]=null;}
                    if (escolha == 1){
                    	String cor = "";
                        String nome = "";
                        int idade = 0;
                        int membros = 0;
                        float peso = 0;
                        boolean pp;     
                        do{sc.nextLine();
                            System.out.print("Cor da escama:");
                            cor = sc.nextLine();
        		}while("".equals(cor));
                        System.out.print("Peconhento (true ou false):");
                        pp = sc.nextBoolean();
             		do{System.out.print("Peso: ");         
                            peso = sc.nextFloat();
                        }while(peso < 0);
                        do{System.out.print("Idade: ");   
                            idade = sc.nextInt();
                        }while( idade < 0);
                        do{ System.out.print("Membros: ");          
                            membros = sc.nextInt();
                        }while(membros < 0);
                        do{ sc.nextLine();
                            System.out.print("Nome: ");
                            nome = sc.nextLine();
                        }while("".equals(nome));
                         System.out.println("ATUALIZADO");
                         reptils[id] = new Reptil(cor,pp,peso,idade,membros,nome);
                         menuPrincipal();
                    }
                    if (escolha == 2){reptils[id].emitirSom();}
                    if (escolha == 3){reptils[id].alimentar();}
                    if (escolha == 4){reptils[id].locomover();}
                    if (escolha == 5){reptils[id].envenenamento();
                    if(escolha==6) {menuPrincipal();}}  
                }else{
                    System.out.println("Não existe cadastro em reptils!!");
                }   break;
            case 3:
                if(this.isAnimalCadastrado(escolha))
                {
                    for (int i=0 ; i < 100 ; i++){
                        if (mamiferos[i]!=null) {
                            System.out.print("Mamifero:"+i+" | Nome:");
                            System.out.println(mamiferos[i].getNome());
                        }
                    }
                    do{
                        System.out.println("---------------------------");
                        System.out.print("Digite o id do Animal de escolha:");
                        id = sc.nextInt();
                        if(mamiferos[id] == null){
                            System.out.print("O animal selecionado não existe!");
                        }
                    }while((id<0 || id>100) && mamiferos[id] != null);
                    System.out.print(mamiferos[id]);
                    
                    do{
                        System.out.println("----- MENU DE AÇÕES -----");
                        System.out.println("[0] Excluir Animal");
                        System.out.println("[2] Emitir Som");
                        System.out.println("[3] Alimentar");
                        System.out.println("[4] Locomover");
                        System.out.println("[5] Voltar ao Menu");
                        System.out.print("Sua escolha:");
                        escolha = sc.nextInt();
                    }while(escolha < 0 || escolha > 5 );
                    if (escolha == 0){mamiferos[id]=null;}
                    if (escolha == 1){
                    	String cor = "";
                    String nome = "";
                    int idade = 0;
                    int membros = 0;
                    float peso = 0;
                    int velocidade = -1;
                    do{ sc.nextLine();
                        System.out.print("Cor do pelo:");
                        cor = sc.nextLine();
                    }while("".equals(cor));
                    do{System.out.print("Velocidade:");
                        velocidade = sc.nextInt();
                    }while(velocidade <0);                    
                    do{System.out.print("Peso:");
                        peso = sc.nextFloat();
                    }while(peso <0 );                    
                    do{System.out.print("Idade:");
                        idade = sc.nextInt();
                    }while( idade <0 );                   
                    do{System.out.print("Membros:");
                        membros = sc.nextInt();
                    }while(membros <0 );               
                    do{sc.nextLine();
                        System.out.print("Nome: ");
                        nome = sc.nextLine();
                    }while("".equals(nome));
                     System.out.println("ATUALIZADO");
                     mamiferos[id] = new Mamifero(cor,velocidade,peso,idade,membros,nome);
                    }
                    if (escolha == 2){mamiferos[id].emitirSom();}
                    if (escolha == 3){mamiferos[id].alimentar();}
                    if (escolha == 4){mamiferos[id].locomover();
                    if(escolha==5) {menuPrincipal();}}
                }else{
                    System.out.println("Não existe cadastro em mamiferos!!");
                }   break;
            default:
                break;
        }
        
        menuPrincipal();
        
	if(escolha==4) {
            menuPrincipal();
	}
    }
    
    private boolean isAnimalCadastrado(int escolha){
        boolean ret = false; 
        
        switch(escolha)
        {
            case 0:
                for (Peixe peixe : peixes) {
                    ret = peixe != null;
                    if(ret)
                        break;
                }
                break;

            case 1:
                for(Ave ave : aves)
                {
                    ret = ave != null;
                    if(ret)
                        break;
                }
                break;
            case 2:
                for(Reptil reptil : reptils)
                {
                    ret = reptil != null;
                    if(ret)
                        break;
                }
                break; 
            case 3:
                for(Mamifero mamifero: mamiferos)
                {
                    ret = mamifero != null;
                    if(ret)
                        break;
                }
                break;
            default:   
                ret = false;
                
        }
        
        return ret;
    }
}
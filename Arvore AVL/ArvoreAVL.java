 class ArvoreAVL
 {
     private AVLNo raiz;     
 
      
     public ArvoreAVL()
     {
         raiz = null;
     }
   
     public void insert(int valor)
     {
    	 System.out.println("Inserindo "+valor);
         raiz = inserir(valor, raiz);
     }

     private int getAltura(AVLNo no )
     {
         return no == null ? -1 : no.altura;
     }
    
     private int max(int x, int y)
     {
         return x > y ? x : y;
     }
 
     private AVLNo inserir(int x, AVLNo no)
     {
         if (no == null)
        	 no = new AVLNo(x);
         
         else if (x < no.valor)
         {
        	 //insere à esquerda
        	 no.esquerdo = inserir( x, no.esquerdo );
        	 
        	 //FB = 2
             if( getAltura( no.esquerdo ) - getAltura( no.direito ) == 2 )
                 //x foi inserido à esquerda do nó esquerdo
            	 if( x < no.esquerdo.valor )
                	 no = rotateLL( no );
                 //x foi inserido à direita do nó esquerdo
            	 else
                	 no = rotateRL( no );
         }
         else if( x > no.valor )
         {
        	 //insere à direita
        	 no.direito = inserir( x, no.direito );
        	 //FB = -2
             if( getAltura( no.direito ) - getAltura( no.esquerdo ) == 2 )
            	 //x foi inserido à direita do nó direito
            	 if( x > no.direito.valor)
                	 no = rotateRR( no );
             	//x foi inserido à esquerda do nó direito
            	 else
                	 no = rotateLR( no );
         }
         //recalcula a altura do nó
         no.altura = max( getAltura( no.esquerdo ), getAltura( no.direito ) ) + 1;
         return no;
     }
    
     private AVLNo rotateLL(AVLNo no)
     {
    	 System.out.println("Rotação LL em " + no.valor);
         AVLNo no2 = no.esquerdo;
         no.esquerdo = no2.direito;
         no2.direito = no;
         no.altura = max( getAltura( no.esquerdo ), getAltura( no.direito ) ) + 1;
         no2.altura = max( getAltura( no2.esquerdo ), no.altura ) + 1;
         return no2;
     }
 
    
     private AVLNo rotateRR(AVLNo no)
     {
    	 System.out.println("Rotação RR " + no.valor);
         AVLNo no2 = no.direito;
         no.direito = no2.esquerdo;
         no2.esquerdo = no;
         no.altura = max( getAltura( no.esquerdo ), getAltura( no.direito ) ) + 1;
         no2.altura = max( getAltura( no2.direito ), no.altura ) + 1;
         return no2;
     }
    
     private AVLNo rotateRL(AVLNo no)
     {
    	 System.out.println("Rotação Dupla");
         no.esquerdo = rotateRR( no.esquerdo );
         return rotateLL( no );
     }
           
     private AVLNo rotateLR(AVLNo no)
     {
    	 System.out.println("Rotação Dupla");
         no.direito = rotateLL( no.direito );
         return rotateRR( no );
     }    
   
     public AVLNo buscar(int val)
     {
         return buscar(raiz, val);
     }
     
     private AVLNo buscar(AVLNo no, int valor)
     {
         AVLNo achou = null;
         while ((no != null) && (achou == null))
         {
             int no_val = no.valor;
             if (valor < no_val)
                 no = no.esquerdo;
             else if (valor > no_val)
                 no = no.direito;
             else
             {
                 achou = no;
                 break;
             }
             achou = buscar(no, valor);
         }
         
         return achou;
     }
   
     public void preorder() {
    	 preorder(raiz);
     }
    	 
     public void preorder(AVLNo no) {
     
     	if (no != null)
         {
        	 System.out.println("Valor: "+no.valor);
        	 preorder(no.esquerdo);              
        	 preorder(no.direito);
         }
     }
     
 }
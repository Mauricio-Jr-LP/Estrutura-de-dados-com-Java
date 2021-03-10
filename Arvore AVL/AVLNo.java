 /* Class AVLNode */
 class AVLNo
 {    
     AVLNo esquerdo, direito;
     int valor;
     int altura;
 
     /* Construtor */
     public AVLNo()
     {
         esquerdo = null;
         direito = null;
         valor = 0;
         altura = 0;
     }
     /* Construtor */
     public AVLNo(int n)
     {
         esquerdo = null;
         direito = null;
         valor = n;
         altura = 0;
     }  
     
     
     
 }
package myproject.vetornv;

public class TwoSum {
    private int[] entrada;
    private int target;
    
    public TwoSum(int[] numbers, int target){
        this.entrada = numbers;
        this.target = target;
    }
    public void calcular(){
        int[] saida =  new int[2];
        int aux=1;
        for(int i=0;i<entrada.length;i++){
            if(entrada[aux]+entrada[i]!=target){
                aux++;
                i--;
                if(aux==entrada.length){
                    i++;
                    aux = i+2;
                }
            }else{
                saida[0]=i;
                saida[1]=aux; 
                break;
            }
            
        }
        for(int i = 0;i<saida.length;i++){
            System.out.print(saida[i]+" "); 
        }
    }
}

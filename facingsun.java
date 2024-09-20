//Here we are trying to find the counts of those buildings that get sunlight without being blocked by the taller buildings on the left side from where the sun rises
public class facingsun {
    public  int countBuildings(int [] height){
    if (height.length == 0){
        return 0;
    }
int count=1;
int max_height = height[0];

for(int i=1;i<height.length;i++){
    if(max_height< height[i]){
        count++;
        max_height =height[i];
    }
   
}

return count;
    } 
    public static void main(String [] args){
        facingsun fs = new facingsun();
        int [] b= {2, 3, 4, 5};
       int building = fs.countBuildings(b);
       
        System.out.println(building);

    }
    
}

//import java.util.Scanner;
public class mean_wala{
    float get_mean( float freq[]){
        float sum=(float) 0.0;
       
        int i;
        for(i=0; i<5; ++i){
            sum += freq[i];
            
        }
        return sum/5;
    } //calculation of mean //
    
    float get_variance(float freq[]){
        float variance=(float) 0.0;
        
        int i;
        for(i=0; i<5; ++i){
            variance +=pow(freq[i] - get_mean(freq) ,2);
        }
        return variance/5;
    } //calculation of variance //
    
    private float pow(float f, int i) {
        return 0;
    }

    float get_stdDeviation(float freq[]){
        int i;
        for(i=0; i<5; ++i){
        }
        return get_stdDeviation(null);
    } //calculation of stdDeviation //
    

    public static void name() {
    
    }

}


public class Knapsack {

    int itemToWeight[][];
    int itemsWeight[];
    int profit[];
    int knapsackWeight;

    public Knapsack(int itemsWeight[], int profit[], int knapsackWeight) {
        itemToWeight = new int[itemsWeight.length][knapsackWeight+1];
        this.itemsWeight = itemsWeight;
        this.profit = profit;
        this.knapsackWeight = knapsackWeight;
    }

    public int getMaxProfit(){

        for (int i = 0; i < itemsWeight.length; i++) {
            for (int j = 1; j <= knapsackWeight; j++) {
                if(itemsWeight[i]<=j){
                  //item can fit
                    if(i!=0){
                        itemToWeight[i][j] = Math.max(itemToWeight[i-1][j],itemToWeight[i-1][j-itemsWeight[i]]+profit[i]);
                    }else{
                        itemToWeight[i][j] = profit[i];
                    }
                }else{
                    if(i!=0){
                        itemToWeight[i][j] =  itemToWeight[i-1][j];
                    }else{
                        itemToWeight[i][j]=0;
                    }
                }
            }
        }
        return itemToWeight[itemsWeight.length-1][knapsackWeight];
    }
}

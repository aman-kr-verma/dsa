class Straight {
    public boolean checkStraightLine(int[][] coordinates) {
        int x=0,y=0;
        Arrays.sort(coordinates);
        if(coordinates.length==2){return true;}
        for(int i=1;i<coordinates.length-1;i++){
            if(((coordinates[i][0]-coordinates[i-1][0])!=(coordinates[i+1][0]-coordinates[i][0])) || ((coordinates[i][1]-coordinates[i-1][1])!=(coordinates[i+1][1]-coordinates[i][1]))){
                return false;
            }
        }
        return true;
    }
}

class StraightLine{
    public static void main(String[] args) {
        int[] arr = {{0,0},{0,1},{0,-1}};
        Straight obj = new Straight();
        System.out.println(obj.checkStraightLine(arr));
    }
}
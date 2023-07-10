class Altitude {
    public int largestAltitude(int[] gain) {
        int altitude=-101,sum=0;
        for(int i=0;i<gain.length;i++){
            sum+=gain[i];
            System.out.println(sum);
            altitude = Math.max(altitude,sum);
        }
        return altitude;
    }
}
class altitudeQ {
    public static void main(String[] args) {
        Altitude obj = new Altitude();
        int[] arr = {-4,-3,-2,-1,4,3,2};
        System.out.println(obj.largestAltitude(arr));
    }
}
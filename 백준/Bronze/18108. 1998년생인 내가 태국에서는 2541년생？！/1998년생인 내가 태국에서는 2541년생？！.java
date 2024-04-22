import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int num = Integer.valueOf(br.readLine());
        int seogi = num - 543;
            
        bw.write(String.valueOf(seogi));
        bw.flush();
        bw.close();
        br.close();
    }
}
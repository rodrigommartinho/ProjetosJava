class TesteMain {
    public static void main(String[] args) {
        System.out.println("args contem::" + args.length + " elemento(s)");
        for(int i = 0; i < args.length; i++) {
            System.out.println("args[" + i + "] = " + args[i]);            
        }
    }
}
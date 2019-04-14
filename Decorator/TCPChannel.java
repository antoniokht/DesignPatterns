class TCPChannel implements Channel {
    send(str){
        System.out.println("Enviando"+str+"via TCP");
    }

    rcv(str){
        System.out.println("Recebendo"+str+"via TCP");
    }
}
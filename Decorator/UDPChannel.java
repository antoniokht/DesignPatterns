class TCPChannel implements Channel {
    send(str){
        System.out.println("Enviando"+str+"via UDP");
    }

    rcv(str){
        System.out.println("Recebendo"+str+"via UDP");
    }
}
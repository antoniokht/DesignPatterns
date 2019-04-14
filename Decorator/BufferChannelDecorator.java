class BufferChannelDecorator extends ChannelDecorator{

    public void BufferChannelDecorator(){
        super(decoratedChannel);
    }

    @Override
    send(str){
        decoratedChannel.send(str);
        System.out.println("Armazenando dados a enviar no buffer");
    }

    @Override
    rcv(str){
        decoratedChannel.rcv(str);
        System.out.println("Armazenando dados no recebidos no buffer");
    }
}
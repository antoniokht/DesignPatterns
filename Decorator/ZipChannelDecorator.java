class ZipChannelDecorator extends ChannelDecorator{

    public void ZipChannelDecorator(){
        super(decoratedChannel);
    }

    @Override
    send(str){
        decoratedChannel.send(str);
        System.out.println("Compactando dados para envio");
    }

    @Override
    rcv(str){
        decoratedChannel.rcv(str);
        System.out.println("Descompactando dados para recebimento");
    }
}
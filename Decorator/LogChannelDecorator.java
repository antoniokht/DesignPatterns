class LogChannelDecorator extends ChannelDecorator{

    public void LogChannelDecorator(){
        super(decoratedChannel);
    }

    @Override
    send(str){
        decoratedChannel.send(str);
        System.out.println("Salvando log do envio");
    }

    @Override
    rcv(str){
        decoratedChannel.rcv(str);
        System.out.println("Salvando log do recebimento");
    }
}
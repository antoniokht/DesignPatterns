class ChannelDecorator implements Channel{
    protected Channel decoratedChannel;

    public abstract ChannelDecorator(Channel c){
        this.decoratedChannel = c;
    }
}
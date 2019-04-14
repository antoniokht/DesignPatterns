public class Main {
    public static void main() {

        Channel1 = new ZipChannelDecorator (new TCPChannel());
        Channel1.send("teste send 1")
        Channel1.rcv("teste rcv 1")

        Channel2 = new BufferChannelDecorator (new TCPChannel());
        Channel2.send("teste send 2")
        Channel2.send("teste rcv 2")

        Channel3 = new BufferChannelDecorator (new UDPChannel());
        Channel3.send("teste send 3")
        Channel3.send("teste rcv 3")

        Channel4= new BufferChannelDecorator (new ZipChannelDecorator (new TCPChannel());
        Channel4.send("teste send 4")
        Channel4.send("teste rcv 4")

        Channel5= new LogChannelDecorator (new UDPChannel());
        Channel5.send("teste send 5")
        Channel5.send("teste rcv 5")


    }
}
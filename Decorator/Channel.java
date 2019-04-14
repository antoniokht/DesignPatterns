interface Channel {
    public void send(byte[] m) throws NetworkException;
    public byte[] recv() throws NetworkException;

}
  
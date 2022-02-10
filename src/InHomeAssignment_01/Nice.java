package InHomeAssignment_01;

class Nice {
    public int x;
}

class NotNice {
    final Nice n;

    public NotNice(Nice n) {
        this.n = n;  // final Nice n = new Nice();
    }
    public void callMe() {
        n.x = 13;
    }

    public static void main(String[] args) {
        Nice n = new Nice();
        NotNice nn = new NotNice(n); //passing ref. variable n
        nn.callMe();

    }
}


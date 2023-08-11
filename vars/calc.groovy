evaluate(new File("hello.groovy"));

def add(x,y) {
    def config = new hello('jesbin')
    echo ${config}
}

def mul(x,y) {
    echo ${x*y}
}
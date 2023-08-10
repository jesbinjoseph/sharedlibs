import Student.Student.*

def add(x,y) {
    def config = new Student.hey('jesbin')
    echo ${config.StudentName}
}

def mul(x,y) {
    echo ${x*y}
}
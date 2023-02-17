#include <iostream>
using namespace std;

class MyClass{
    private:
        int privateatt;
    public:
        int publicatt;
        MyClass(int pri, int pub){
            privateatt = pri;
            publicatt = pub;
        }
        void insideMethod(){
            cout << "insideMethod" << endl;
        }

        void outsideMethod();
};

void MyClass::outsideMethod(){
    cout << "outsideMehthod" <<endl;
}

int main(int argc, char **argv)
{
    MyClass ob(12,31);
    ob.insideMethod();
    ob.outsideMethod();
    cout << ob.publicatt <<endl;
    // cout << ob.privateatt << endl;
    return 0;
}
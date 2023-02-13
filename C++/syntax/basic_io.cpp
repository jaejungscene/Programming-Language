#include <iostream>
#define _CONDITION

#ifdef _CONDITION
    /**
     * use "using namespace std"
    */
    using namespace std;
    int main(){
        
        int x;
        cin >> x;
        cout << "x is " << x << endl;
        return 0;
    }
#else
    int main(){
        int x;
        std::cin >> x;
        std::cout << "x is " << x << std::endl;
        return 0;
    }
#endif
#include <iostream>
#include <vector>
using namespace std;

int findMax( vector<int>);
bool palindrone(int n);
int main(){
    int mult = 0;
    vector<int> palinList;
    
    for (int num1 = 999; num1 >= 100; num1--){
        for(int num2 = 999; num2 >= 100; num2--){
            mult = num1*num2;
            if( palindrone(mult)){
                palinList.push_back(mult);
            }
        }
    }
    
    cout << findMax( palinList);
    
    return 0;
}

bool palindrone( int n){
    int rev = 0;
    int org = n;
    while( n > 0){
        rev = (10 * rev) + n % 10;
        n /= 10;
    }
    
    if( org == rev ){
        return true;
    }
    return false;
}

int findMax( vector<int> n){
    int max = 0;
    for( vector<int>:: const_iterator i = n.begin(); i != n.end(); i++){
        if( max < *i){
            max = *i;
        }
    }
    return max;
}
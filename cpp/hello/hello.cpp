#include <algorithm>
#include <cctype>
#include <iostream>
#include <string>

int main(int argc, char* argv[]) {
    std::cout << "Hello,";

    if(argc > 1)
        for(int i = 1; i < argc; ++i) {
            std::string str(argv[i]);
            std::transform(str.begin(), str.begin() + 1, str.begin(),
                           [](unsigned char c) { return std::toupper(c); });
            std::cout << " " << str;
        }
    else
        std::cout << " World";

    std::cout << "!" << std::endl;

    return 0;
}

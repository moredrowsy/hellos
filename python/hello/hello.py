import sys


if __name__ == "__main__":
    argv = sys.argv[1:]

    print("Hello,", end="")

    if len(argv) > 0:
        for v in argv:
            print(f' {v.capitalize()}', end="")
    else:
        print(" World", end="")

    print("!")

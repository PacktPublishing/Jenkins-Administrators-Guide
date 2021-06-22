import sys
import unittest

def adder(a: int, b: int) -> int:
    return int(a) + int(b)

def main(args):
    print(adder(args[1], args[2]))

class TestAdder(unittest.TestCase):
    def test_adder_success(self):
        self.assertEqual(adder(3, 5), 8)

    def test_adder_typeerror(self):
        self.assertRaises(TypeError, adder, 5)

    def test_adder_valueerror(self):
        self.assertRaises(ValueError, adder, 1, 'a')

    def test_main_indexerror(self):
        self.assertRaises(IndexError, main, [])

if __name__ == '__main__':
    main(sys.argv)

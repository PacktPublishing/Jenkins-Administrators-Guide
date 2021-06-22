import sys
import unittest

def subtractor(a: int, b: int) -> int:
    return int(a) - int(b)

def main(args):
    print(subtractor(args[1], args[2]))

class TestSubtractor(unittest.TestCase):
    def test_subtractor_success(self):
        self.assertEqual(subtractor(8, 5), 3)

    def test_subtractor_typeerror(self):
        self.assertRaises(TypeError, subtractor, 5)

    def test_subtractor_valueerror(self):
        self.assertRaises(ValueError, subtractor, 1, 'a')

    def test_main_indexerror(self):
        self.assertRaises(IndexError, main, [])

if __name__ == '__main__':
    main(sys.argv)

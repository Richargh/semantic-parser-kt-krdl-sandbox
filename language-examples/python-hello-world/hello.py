"""
    Tick
    Trick
    Track
"""
def Foo(x):
    foo = 4
    if foo:
        noop()
    # Python comment
    str = """
        Tick
        Trick
        Track
    """
    switch={
          1:'a',
          2:'e',
          3:'i',
          4:'o',
          5:'u'
    }
    for i in range(1, 5):
        handle(i)

def noop():
    ""

def nesting():
    def nested():
        def noop():
            ""

def handle(num):
    print num

print Foo("hi")


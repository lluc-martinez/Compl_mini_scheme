all: scheme.g4
	antlr4 -Dlanguage=Python3 -visitor scheme.g4

run:
	python3 scheme.py $(FILE)

clean:
	rm -f *.pyc *.tokens *.interp
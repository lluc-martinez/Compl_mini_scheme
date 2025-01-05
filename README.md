# Intèrpret Mini Scheme

## Visió general

Aquest projecte és un intèrpret de Mini Scheme implementat utilitzant Python i ANTLR. L'intèrpret pot llegir i avaluar expressions escrites en una versió simplificada de Scheme, un llenguatge de programació funcional derivat de Lisp. L'intèrpret suporta operacions aritmètiques bàsiques, definicions de funcions, condicionals, manipulació de llistes i funcions d'ordre superior.

## Característiques

- **Operacions aritmètiques**: Suporta `+`, `-`, `*`, `/`, `>`, `<`, `>=`, `<=`, `=`, `<>`.
- **Definicions de funcions**: Permet definir funcions utilitzant `define`.
- **Condicionals**: Suporta `if` i `cond` per a expressions condicionals.
- **Llistes**: Suporta operacions de llistes com `car`, `cdr`, `cons` i `null?`.
- **Recursió**: Suporta crides recursives a funcions.
- **Variables locals**: Suporta definicions de variables locals utilitzant `let`.
- **Funcions d'ordre superior**: Suporta funcions que prenen altres funcions com a arguments, com `map` i `filter`.
- **Entrada/Sortida**: Suporta la lectura des de l'entrada estàndard i l'escriptura a la sortida estàndard utilitzant `read`, `display` i `newline`.

## Ús

Per executar l'intèrpret, utilitza les següents comandes:

```bash
make
python3 scheme.py <path_to_scheme_file>
```

Per exemple:

```bash
python3 scheme.py test_extended.scm < test_extended.inp > test_extended.out
```

## Estructura del projecte

- `scheme.g4`: Fitxer de gramàtica ANTLR que defineix la sintaxi de Mini Scheme.
- `scheme.py`: Implementació principal de l'intèrpret en Python.
- `test_extended.scm`: Jocs de proves ampliats per a l'intèrpret.
- `test_extended.inp`: Fitxer d'entrada per als jocs de proves.
- `test_extended.out`: Fitxer de sortida esperat per als jocs de proves.

## Decisions de disseny

### Gramàtica

La gramàtica està definida a `scheme.g4` i inclou regles per a expressions bàsiques, definicions de funcions, condicionals, operacions de llistes i funcions d'ordre superior. La gramàtica assegura que la sintaxi de Mini Scheme es parsegi correctament i suporta les característiques requerides.

### Intèrpret

L'intèrpret està implementat a `scheme.py` utilitzant el patró de visitador proporcionat per ANTLR. Components clau inclouen:

- **Entorn global**: Un diccionari que emmagatzema variables globals i definicions de funcions.
- **Definicions de funcions**: Les funcions es defineixen utilitzant `define` i s'emmagatzemen a l'entorn global. També es suporten expressions lambda.
- **Condicionals**: Les expressions `if` i `cond` s'avaluen basant-se en les condicions proporcionades.
- **Operacions de llistes**: Funcions com `car`, `cdr`, `cons` i `null?` estan implementades per manipular llistes.
- **Funcions d'ordre superior**: Funcions com `map` i `filter` es defineixen dins del codi Scheme i es poden utilitzar per aplicar funcions a llistes.

### Maneig d'errors

L'intèrpret inclou un maneig bàsic d'errors per a variables i funcions no definides. Es suposa que no es produeixen errors semàntics ni errors d'execució (per exemple, divisió per zero) segons els requisits del projecte.

## Proves

El projecte inclou un conjunt complet de jocs de proves a `test_extended.scm` per verificar la funcionalitat de l'intèrpret. Les proves cobreixen diverses característiques com operacions aritmètiques, definicions de funcions, condicionals, operacions de llistes i funcions d'ordre superior. La sortida esperada es proporciona a `test_extended.out`.

### Detalls dels tests

- **Operacions aritmètiques**: Es comprova la correcta avaluació de les operacions `+`, `-`, `*`, `/`, `>`, `<`, `>=`, `<=`, `=`, `<>`.
- **Definicions de funcions**: Es comprova la definició i crida de funcions, incloent funcions recursives com `factorial`.
- **Condicionals**: Es comprova l'avaluació de condicions amb `if` i `cond`.
- **Llistes**: Es comprova la manipulació de llistes amb `car`, `cdr`, `cons` i `null?`.
- **Variables locals**: Es comprova la definició de variables locals amb `let`.
- **Funcions d'ordre superior**: Es comprova la definició i ús de funcions d'ordre superior com `map` i `filter`.
- **Entrada/Sortida**: Es comprova la lectura i escriptura amb `read`, `display` i `newline`.

## Conclusió

Aquest intèrpret de Mini Scheme proporciona una plataforma funcional i extensible per avaluar expressions de Scheme. El projecte demostra l'ús d'ANTLR per al parsing i Python per a la implementació d'un intèrpret, amb un enfocament en la claredat, precisió i completesa tant en el codi com en la documentació.

# kitchen-sink
Repo used for testing things on GitHub as customer would see it

```console
user@machine $ echo $FOO
bar
user@machine $ export FOO=bar
user@machine $ echo $FOO
bar
user@machine $ FOO=bar
user@machine $ echo $FOO
user@machine $ for i in 1 2 3; do echo $i; done
1
2
3
user@machine $ for i in $(ls -1); do echo $i; done
file1
file2
file3
user@machine $
```

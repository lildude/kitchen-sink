# kitchen-sink
Repo used for testing things on GitHub as customer would see it

Common complaint... this looks good:

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

Remove the prompt and you don't get anything pretty:

```console
echo $FOO
bar
export FOO=bar
echo $FOO
bar
FOO=bar
echo $FOO
for i in 1 2 3; do echo $i; done
1
2
3
for i in $(ls -1); do echo $i; done
file1
file2
file3
```

Or without output:

```console
sudo systemctl start docker.service
sudo systemctl enable docker.service
npm run local:down
npm run local
```

And using `shell` gives:

```shell
sudo systemctl start docker.service
sudo systemctl enable docker.service
npm run local:down
npm run local
```

Which is also how Atom and VSCode highlight things.


| h1 | h2 | h3 |
|----|----|----|
| v1 | v2 | v3 |


SSH signed commit

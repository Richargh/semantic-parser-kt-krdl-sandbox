#!/usr/bin/env bash

# Python
docker run --rm -v ${PWD}:/local ghcr.io/github/semantic/semantic parse /local/python-hello-world/hello.py \
    --json-symbols \
    > _analyzed/python-hello-world.json

docker run --rm -v ${PWD}:/local ghcr.io/github/semantic/semantic parse /local/python-hello-world/hello.py \
    --sexpression \
    > _analyzed/python-hello-world.ast

docker run --rm -v ${PWD}:/local ghcr.io/github/semantic/semantic parse /local/python-hello-world/hello.py \
    --show \
    > _analyzed/python-hello-world.show

# Js
docker run --rm -v ${PWD}:/local ghcr.io/github/semantic/semantic parse /local/js-hello-world/hello.js \
    --json-symbols \
    > _analyzed/js-hello-world.json

docker run --rm -v ${PWD}:/local ghcr.io/github/semantic/semantic parse /local/js-hello-world/hello.js \
    --sexpression \
    > _analyzed/js-hello-world.ast

docker run --rm -v ${PWD}:/local ghcr.io/github/semantic/semantic parse /local/js-hello-world/hello.js \
    --show \
    > _analyzed/js-hello-world.show

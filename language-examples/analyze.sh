#!/usr/bin/env bash

# Python
docker run --rm -v ${PWD}:/local ghcr.io/github/semantic/semantic parse /local/python-hello-world/ \
    --json-symbols \
    > _analyzed/python-hello-world.json

docker run --rm -v ${PWD}:/local ghcr.io/github/semantic/semantic parse /local/python-hello-world/ \
    --sexpression \
    > _analyzed/python-hello-world.ast

docker run --rm -v ${PWD}:/local ghcr.io/github/semantic/semantic parse /local/python-hello-world/ \
    --show \
    > _analyzed/python-hello-world.show

# Js
docker run --rm -v ${PWD}:/local ghcr.io/github/semantic/semantic parse /local/js-hello-world/ \
    --json-symbols \
    > _analyzed/js-hello-world.json

docker run --rm -v ${PWD}:/local ghcr.io/github/semantic/semantic parse /local/js-hello-world/ \
    --sexpression \
    > _analyzed/js-hello-world.ast

docker run --rm -v ${PWD}:/local ghcr.io/github/semantic/semantic parse /local/js-hello-world/ \
    --show \
    > _analyzed/js-hello-world.show

#!/usr/bin/env bash

docker run --rm -v ${PWD}:/local ghcr.io/github/semantic/semantic parse /local/python-hello-world/hello.py \
    --json-symbols \
    > _analyzed/python-hello-world.json


FROM mcr.microsoft.com/devcontainers/base:bookworm

# The desktop-lite feature sets DISPLAY=:1 before installing its packages, so
# xfonts-terminus's install script runs `xset fp rehash` against a display that
# isn't running yet and can hang the build forever. Installing it here, while
# DISPLAY is unset, means the feature finds it already installed.
RUN apt-get update \
    && DEBIAN_FRONTEND=noninteractive apt-get install -y --no-install-recommends xfonts-terminus \
    && rm -rf /var/lib/apt/lists/*

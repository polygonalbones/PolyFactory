{
  lib,
  mkShell,
  jetbrains,
  libGL,
  glfw3-minecraft,
  flite,
  libpulseaudio,
}:
let
  java = jetbrains.jdk-no-jcef;

  packages = [
    libGL
    glfw3-minecraft
    flite
    libpulseaudio
  ];
in
mkShell {
  inherit packages;

  nativeBuildInputs = [
    java
  ];

  LD_LIBRARY_PATH = lib.makeLibraryPath packages;
  JAVA_HOME = "${java.home}";
}

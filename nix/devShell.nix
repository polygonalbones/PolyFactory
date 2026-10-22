{
  mkShell,
  jetbrains,
}:
mkShell {
  packages = [
    jetbrains.jdk-no-jcef
  ];
}

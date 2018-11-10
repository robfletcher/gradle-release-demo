This is an example project showing step-by-step how to build an automated release workflow for an open-source project.

There's a [related post](https://medium.com/@rfletcher_96265/an-automated-release-workflow-using-gradle-nebula-bintray-circleci-694e65184348) describing each step in detail.

Each step in the tutorial is a numbered branch in this Git repository so you can see at each stage what changes.

The steps are:

1. Build standard source and javadoc jars and publish to a local Maven repository. _[diff](https://github.com/maheshrajannan/gradle-release-demo/compare/1-build)_
2. Apply semantic versioning and link release versions to Git tags. _[diff](https://github.com/maheshrajannan/gradle-release-demo/compare/1-build...2-versioning)_
3. Publish artifacts to Bintray. _[diff](https://github.com/maheshrajannan/gradle-release-demo/compare/2-versioning...3-publish)_
4. Automate the whole process using CircleCI so that simply creating a release on GitHub triggers publishing of artifacts to Bintray. _[diff](https://github.com/maheshrajannan/gradle-release-demo/compare/3-publish...4-automate)_

You can see the published artifacts on [Bintray](https://bintray.com/maheshrajannan/demo/) and the continuous integration workflow on [CircleCI](https://circleci.com/gh/maheshrajannan/gradle-release-demo).

![CircleCI](https://img.shields.io/circleci/project/github/maheshrajannan/gradle-release-demo.svg?style=for-the-badge)
![Bintray](https://img.shields.io/bintray/v/maheshrajannan/demo/demo-core.svg?style=for-the-badge)
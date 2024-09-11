# 3AHIT all the Files

by  Jan Weichhart and Ben Simak

## Structure and norms

### Files names
  
- for normal files: JJJJ-MM-DD-Theme-NameFirstLetter
- for summaries: TestDate(JJJJ-MM-DD)-NameFirstLetter

### Folder Structure
  
```mermaid
  graph  LR
  f1[3ahit]
  f2[subject]
  f3[teacher
  //optional]
  f3.5[teacher 2
  //optional]
  f4[summary]
  f5[imgs]
  f6((file name))
  f7((file name))
  f8((file name))

  f4.5[summary]
  f5.5[imgs]
  f6.5((file name))
  f7.5((file name))
  f8.5((file name))

  f1 --> f2
  f2 --> f3
  f2 --> f3.5
  f3 --> f4
  f3 --> f5
  f3 --> f8
  f4 --> f6
  f5 --> f7

  f3.5 --> f4.5
  f3.5 --> f5.5
  f3.5 --> f8.5
  f4.5 --> f6.5
  f5.5 --> f7.5

  ```

## tools

- mermaid
  - [mermaid cheat sheet](https://mermaid.js.org/ecosystem/tutorials.html)
- markdown
  - [md cheat sheet](https://github.com/adam-p/markdown-here/wiki/Markdown-Cheatsheet)
- latex
  - [latex cheat sheet](https://quickref.me/latex.html)
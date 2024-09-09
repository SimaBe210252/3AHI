# 3AHIT all the Files

by  Jan Weichhart and Ben Simak

## Structure and norms

- ### File names
  
  - for normal files: JJJJ-MM-DD-Theme-NameFirstLetter
  - for summaries: TestDate(JJJJ-MM-DD)-NameFirstLetter

- ### Folder Structure
  
  ```mermaid
    graph  TD
    f1[3ahit]
    f2[subject]
    f3[teacher]
    f4[summary]
    f5[imgs]
    f6((file name))
    f7((file name))
    f8((file name))

    f1 --> f2
    f2 --> f3
    f3 --> f4
    f3 --> f5
    f3 --> f8
    f4 --> f6
    f5 --> f7
    ```
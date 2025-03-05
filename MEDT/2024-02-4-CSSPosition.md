# CSS-Position


static	als default eingestellt
.element-static {
  position: static;
}
relative	basierend auf der originalen position
.element-relative {
  position: relative;
  top: 10px; /* Moves down 10 pixels */
}
absolute
.element-absolute {
  position: absolute;
  top: 20px; /* Positions itself at 20 pixels from nearest ancestor */
}	
fixed	bleibt an der gleiche stelle auf dem bildschirm trotz scrolling
.element-fixed {
  position: fixed;
  bottom: 0; /* Stays at bottom of viewport */
}
sticky	wechseld zwischen relative und fixed abhängig davon ob man scrolled oder nicht
.element-sticky {
  position: sticky;
  top:0; /* Sticks at this point when scrolled */
}


# flexbox
## flex-direction

row : von links nach rechts aligned

row-reverse: von rechts nach links aligned

column: von oben nach unten aligned

column-reverse: von unten nach oben aligned




2. align-items
## align-items
ist die einstellung für das alignen an der x achse

stretch : füllt die x ache mit gegebenen items aus

flex-start: werden am anfang der x achse aligned

flex-end: werden am ende der x achse aligned


center: werden in der mitte der x achse aligned

zb.
.container {
    display: flex;
    align-items: center; // vertical centerd
}

.container {
    display: flex;
    flex-direction: column;/ horizontall aligned
    align-items: center;
}

baseline: 

## justify-content

flex-start: aligned am anfang eines containers.
.container {
    display: flex;
    justify-content: flex-start; 
}

flex-end: aligned am ende eines containers
.container {
    display: flex;
    justify-content: flex-end;
}

center: alined in der mitte eines containers
.container {
    display: flex;
    justify-content: center;
}
space-between: die item werden in regelmäßigen abständen aligned
.container {
    display: flex;
    justify-content: space-between; /* Gleicher Abstand zwischen den Elementen */
}
space-around: der verfügbare raum wird um die items regelmäßig verteilt.
.container {
    display: flex;
    justify-content: space-around;
}
space-evenly: der gesamt raum wird gleichmäßig verteil including ende und anfang.
.container {
    display: flex;
    justify-content: space-evenly; // Gleichmäßiger abstand überall
}
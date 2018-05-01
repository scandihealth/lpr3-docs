## About
This page contains definitios use throughout the technical documentation.

## Episode of care element
The ForloebElement.

## Issue transitive closure
The issue transitive closure is defined as the reachability relation of an episode of care element vertex in the directed acylic graph defined for the logical model with the exception of the edge (episode of care element link, episode of care element).  
Edges in the reachability relation of the issue transitive closure are

 * episode of care element -> patient
 * episode of care element -> episode of care element marker
 * episode of care element -> referral
 * episode of care element -> episode of care element link
 * episode of care element -> encounter
 * episode of care element -> procedure
 * episode of care element -> observation organizer
 * patient -> place of residence
 * episode of care element marker -> observation organizer
 * encounter -> stay
 * encounter -> referral
 * encounter -> payment information
 * encounter -> procedure
 * encounter -> observation organizer
 * procedure -> observation organizer
 * observation organizer -> observation
